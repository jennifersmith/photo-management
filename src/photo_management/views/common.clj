(ns photo-management.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "photo-management"]
               (include-css "css/bootstrap.css")
               (include-css "css/custom.css")
               ]
              [:body
               [:div.topbar
                [:div.topbar-inner
                 [:div.container-fluid
                  [:div.brand
                   [:a {:href "/"} "Photo Management (done right)" ]]]]]
               [:div.container-fluid
                [:div.sidebar]
                [:div.content
                 content
                 ]]]))
