# IEEE Internet Computing Magazine Example Application

## Setup 

You need the Google App Engine java sdk.  You can get it [here](http://googleappengine.googlecode.com/files/appengine-java-sdk-1.3.3.zip).

After downloading and extracting it, make sure you add the bin directory to your PATH.  You will also need to install [leiningen](http://github.com/technomancy/leiningen) before you begin.  Once you have completed the install simply run 

    lein deps
    cp path/to/appengine/lib/appengine-tools-api.jar war/WEB-INF/lib
    cp path/to/appengine/lib/user/appengine-api-1.0-sdk-1.3.3.jar war/WEB-INF/lib
    lein compile

## Running the application locally

To start the app run:

    dev_appserver.sh war

and visit [http://localhost:8080](http://localhost:8080)
