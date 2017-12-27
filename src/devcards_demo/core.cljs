(ns devcards-demo.core
  (:require
   [sablono.core :as sab :include-macros true]
   [devcards.core :as dc :include-macros true]))

(enable-console-print!)

(dc/defcard first-card
  (sab/html [:div
             [:h1 "This is your first devcard!"]]))

(goog-define ^boolean start-devcards? false)
(when start-devcards? 
  (println "Starting devcards")
  (dc/start-devcard-ui!))