(defproject lein-beanstalk "0.2.8-SNAPSHOT"
  :description "Leiningen plugin for Amazon's Elastic Beanstalk"
  :url "https://github.com/weavejester/lein-beanstalk"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [com.amazonaws/aws-java-sdk "1.4.2"]
                 [lein-ring "0.8.3"]]
  :eval-in-leiningen true
  :plugins [[s3-wagon-private "1.1.2"]]
  :repositories [["private" {:url "s3p://com.blue.mvn/releases"
                             :username :env/AWS_ACCESS_KEY
                             :passphrase :env/AWS_SECRET_KEY}]]
)
