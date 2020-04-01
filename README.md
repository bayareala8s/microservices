# microservices

Ratings:
curl -X GET "http://localhost:8000/rating/objectid/5e72a5e1f49d9d13241babe1" -H "accept: */*"
curl -X GET "http://localhost:8000/rating/userid/10" -H "accept: */*"
curl -X DELETE "http://localhost:8000/rating/objectid/5e84de7836c2996165dfba13" -H "accept: */*"

Movies:
curl -X GET "http://localhost:8000/movie/movieid/3" -H "accept: */*"
curl -X GET "http://localhost:8000/movie/objectid/5e83d8f6e6f04b7f4bf9174e" -H "accept: */*"
