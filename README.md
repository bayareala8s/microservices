# Microservices

    

Ratings: <br />
    "ns" : "movielens.ratings", <br />
    "size" : 1950007959.0, <br />
    "count" : NumberInt(25000098), <br />
    "avgObjSize" : NumberInt(78), <br />
    "storageSize" : NumberInt(617680896) <br />
<br />
curl -U admin:bayareala8s -X GET "http://localhost:8000/rating/objectid/5e72a5e1f49d9d13241babe1" -H "accept: */*" <br />
curl -U admin:bayareala8s -X GET "http://localhost:8000/rating/userid/10" -H "accept: */*" <br />
curl -U admin:bayareala8s -X POST "http://localhost:8000/rating" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"movieId\": 1, \"rating\": 5.0, \"timestamp\": 1227571313, \"userId\": 1}" <br />
curl -U admin:bayareala8s -X PUT "http://localhost:8000/rating/objectid/5e84ecb136c299641b85a5f6" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"movieId\": 1, \"rating\": 4.0, \"timestamp\": 1147878820, \"userId\": 1}" <br />
curl -U admin:bayareala8s -X DELETE "http://localhost:8000/rating/objectid/5e84ecb136c299641b85a5f6" -H "accept: */*" <br />

Movies: <br />
    "ns" : "movielens.movies", <br />
    "size" : NumberInt(6173860), <br />
    "count" : NumberInt(62423), <br />
    "avgObjSize" : NumberInt(98), <br />
    "storageSize" : NumberInt(3047424), <br />
curl -U admin:bayareala8s -X GET "http://localhost:8000/movie/objectid/5e83d8f6e6f04b7f4bf9174e" -H "accept: */*" <br />
curl -U admin:bayareala8s -X GET "http://localhost:8000/movie/movieid/3" -H "accept: */*" <br />
curl -U admin:bayareala8s -X POST "http://localhost:8000/movie" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"genres\": \"Comedy|Drama|Romance\", \"movieId\": 1, \"title\": \"Titanic\"}"
curl -U admin:bayareala8s -X PUT "http://localhost:8000/movie/objectid/5e8510bd36c2996ae718e2f5" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"genres\": \"Comedy|Drama|Romance\", \"movieId\": 1, \"title\": \"Avatar\"}"
curl -U admin:bayareala8s -X DELETE "http://localhost:8000/movie/objectid/5e8510bd36c2996ae718e2f5" -H "accept: */*"

