from flask import Flask, render_template, request, jsonify
from pymongo import MongoClient
import certifi

ca = certifi.where();

client = MongoClient('mongodb+srv://test:sparta@cluster0.jetf0d5.mongodb.net/Cluster0?retryWrites=true&w=majority',tlsCAFile=ca)
db = client.dbsparta
app = Flask(__name__)

@app.route('/')
def home():
   return render_template('index02.html')

@app.route("/homework", methods=["POST"])
def homework_post():
    name_receive = request.form['name_give']
    comment_receive = request.form['comment_give']

    doc = {
        'name' : name_receive,
        'comment' : comment_receive
    }
    db.homework02.insert_one(doc);
    return jsonify({'msg':'저장 완료!'})

@app.route("/homework", methods=["GET"])
def homework_get():
    comment_list = list(db.homework02.find({},{'_id':False}))
    return jsonify({'comment':comment_list})

if __name__ == '__main__':
   app.run('0.0.0.0', port=5000, debug=True)