(ns labyrinth.state
  (:require [reagent.core :as r]))

(def cast (r/atom {}))

(def addams (r/atom {:cast-01 {:id :cast-01
                               :firstname "Morticia"
                               :lastname "Addams"
                               :actorname "Carolyn Jones"
                               :talent "Botanist"}
                     :cast-02 {:id :cast-02
                               :firstname "Gomez"
                               :lastname "Addams"
                               :actorname "John Astin"
                               :talent "Finance"}
                     :cast-03 {:id :cast-03
                               :firstname "Fester"
                               :lastname "Addams"
                               :actorname "Jackie Coogan"
                               :talent "Demolition"}
                     :cast-04 {:id :cast-04
                               :firstname "Lurch"
                               :lastname "Addams"
                               :actorname "Ted Cassidy"
                               :talent "concierge services"}
                     :cast-05 {:id :cast-05
                               :firstname "Grandman"
                               :lastname "Addams"
                               :actorname "Blossom Rock"
                               :talent "Retired"}
                     :cast-06 {:id :cast-06
                               :firstname "Wednesday"
                               :lastname "Addams"
                               :actorname "Lisa Loring"
                               :talent "n/a"}
                     :cast-07 {:id :cast-07
                               :firstname "Pugsley"
                               :lastname "Addams"
                               :actorname "Ken Weatherwax"
                               :talent "n/a"}}))