from flask import Flask, render_template, jsonify, request
app = Flask(__name__)
from pymongo import MongoClient
import certifi
from datetime import datetime

ca = certifi.where();
client = MongoClient('localhost',27017,tlsCAFile=ca)
db = client.dbsparta_plus_week1

@app.route('/')
def home():
    return render_template('index.html')

@app.route('/diary', methods=['GET'])
def show_diary():
    diaries = list(db.diary.find({}, {'_id': False}))
    return jsonify({'all_diary': diaries})

@app.route('/diary', methods=['POST'])
def save_diary():
    title_receive = request.args.get('title_give')
    content_receive = request.args.get('content_give')

    file = request.files["file_give"]
    extension = file.filename.split('.')[-1]


    today = datetime.now()
    mytime = today.strftime('%Y-%m-%d-%H-%M-%S')

    filename = f'file-{mytime}'

    save_to = f'static/{filename}.{extension}'
    file.save(save_to)

    doc = {
        'title':title_receive,
        'content':content_receive,
        'file':f'{filename}.{extension}'
    }
    db.diary.insert_one(doc)
    return jsonify({'msg': '저장 완료!'})

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000, debug=True)