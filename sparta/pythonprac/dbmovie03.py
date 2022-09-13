from pymongo import MongoClient
import certifi

ca = certifi.where();

client = MongoClient('mongodb+srv://test:sparta@cluster0.jetf0d5.mongodb.net/Cluster0?retryWrites=true&w=majority',tlsCAFile=ca)
db = client.dbsparta

# u = db.m.find_one({'title':'가버나움'})['point']
# movies = list(db.m.find({},{'_id':False}))
#
# for movie in movies:
#     if movie['point'] == u:
#         print(movie['title'])

db.m.update_one({'title':'가버나움'},{'$set':{'point':"0"}})