from pymongo import MongoClient
import certifi

ca = certifi.where();

client = MongoClient('mongodb+srv://test:sparta@cluster0.jetf0d5.mongodb.net/Cluster0?retryWrites=true&w=majority',tlsCAFile=ca)
db = client.dbsparta

# movie = db.movies02.find_one({'title':'가버나움'},{'_id':False})
# s = movie['star']
# all_movies = list(db.movies02.find({'star':s}, {'_id': False}))
# for mo in all_movies:
#     print(mo['title'])
movie = db.movies02.find_one({'title':'가버나움'})
star = movie['star']

db.movies02.update_one({'title':'가버나움'},{'$set':{'star':'0'}})

