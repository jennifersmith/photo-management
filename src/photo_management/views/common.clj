(ns photo-management.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "photo-management"]
               (include-css "http://twitter.github.com/bootstrap/1.4.0/bootstrap.min.css")]
              [:body
               [:div.container-fluid
                
                [:div.sidebar]
                [:div.content
                 content]]]))
