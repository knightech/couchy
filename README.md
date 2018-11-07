# couchbase test

Steps (from https://hub.docker.com/_/couchbase)

run couchbase in docker:

`docker run -d --name db -p 8091-8094:8091-8094 -p 11210:11210 couchbase`

now, connect to couchbase server and create a bucket and a user

`curl http://localhost:8091`

for this example, bucket is test, user is test, password is test-user

next, fire up the app and let it connect

lastly, run the integration tests which will connect and add some data (and delete it too)

run first test and then check the console for data by going to the query tab and executing

`select * from 'test'`




