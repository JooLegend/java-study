import os
from flask import Flask, render_template, request, redirect
from flask_sqlalchemy import SQLAlchemy
from Models import db
from Models import User

app = Flask(__name__)


@app.route('/')
def hello():
    return 'Hello world!'


@app.route('/register', methods=['GET', 'POST'])
def register():
    if request.method == 'GET':
        return render_template("register.html")
    else:
        userid = request.form.get('userid')
        email = request.form.get('email')
        password = request.form.get('password')
        password_2 = request.form.get('password')

        if not (userid and email and password and password_2):
            return "입력되지 않은 정보가 있습니다."
        elif password != password_2:
            return "비밀번호가 일치하지 않습니다."
        else:
            usertable = User()
            usertable.userid = userid
            usertable.email = email
            usertable.password = password

            db.session.add(usertable)
            db.session.commit()
            return "회원가입 되었습니다!"
        return redirect('/')

if __name__ == "__main__":
    # 데이터베이스---------
    basedir = os.path.abspath(os.path.dirname(__file__))  # 현재 파일이 있는 디렉토리 절대 경로
    dbfile = os.path.join(basedir, 'db.sqlite')  # 데이터베이스 파일을 만든다

    app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///' + dbfile
    app.config['SQLALCHEMY_COMMIT_ON_TEARDOWN'] = True  # 사용자에게 정보 전달완료하면 teadown. 그 때마다 커밋=DB반영
    app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False  # 추가 메모리를 사용하므로 꺼둔다

    db.init_app(app)
    db.app = app
    db.create_all()

    app.run(host="127.0.0.1", port=5000, debug=True)
