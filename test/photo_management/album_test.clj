(ns photo-management.album-test
  (:use photo-management.models.album  clojure.test midje.sweet))


  
 
;.;. [31mFAIL[0m at (NO_SOURCE_FILE:1)
;.;.     Expected: [{:path "/foo/Greece 1989", :name "Greece 1989"}]
;.;.       Actual: ["Greece 1989"]
(fact
  (get-albums "/foo/") => [
                         {:name "Greece 1989" :path "/foo/Greece 1989"}]
  (provided (list-dir "/foo/") => ["Greece 1989"]))

