from flask import *
from flask_pymongo import PyMongo

web_bulletin = Flask(__name__, template_folder="templates")
web_bulletin.config["MONGO_URI"] = "mongodb://localhost:27017/bulletin"
web_bulletin.config['SECRET_KEY'] = 'psswrd'

mongo = PyMongo(web_bulletin)
web_bulletin.secret_key = '사용자 지정 비밀번호'

@web_bulletin.route("/login", methods=["GET", "POST"])
def bulletin_write():
    if request.method == "POST":
        email = request.form.get("email", type=str)
        pw = request.form.get("pw", type=str)

        if email =="":
            flash("이메일을 입력해주세요!")
            return render_template("login.html")
        elif pw == "":
            flash("비밀번호를 입력해주세요!")
            return render_template("login.html")

        signup = mongo.db.signup
        check_cnt = signup.find({"email":email}).count()
        if check_cnt > 0:
            flash("등록된 이메일 입니다!")
            return render_template("login.html")

        to_db = {
            "email": email,
            "pw": pw,
        }
        to_db_signup = signup.insert_one(to_db)
        last_signup = signup.find().sort("_id",-1).limit(5)
        for last in last_signup:
            print(last)

        flash("가입해주셔서 감사합니다!")
        return render_template("login.html")
    else:
        return render_template("login.html")

if __name__ == "__main__":
    web_bulletin.run(host='0.0.0.0', debug=True, port=9999)