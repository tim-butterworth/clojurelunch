(ns diamond.core-spec
  (:require [speclj.core :refer :all]
            [diamond.core :refer :all]
            [clojure.string :refer [join]]))

(describe "a test"
          (it "FIXME, I fail."
              (should= 1 1)))

(describe "make-diamond"
          (it "prints a diamond for 1"
              (should= (make-diamond 1) "1"))

          (it "prints a diamond for 2"
              (should= (make-diamond 2) (join "\n"
                                              [
                                               " 1"
                                               "121"
                                               " 1"
                                               ])))
          
          (it "prints a diamond"
              (should= (make-diamond 5) (join "\n"
                                              [
                                               "    1"
                                               "   121"
                                               "  12321"
                                               " 1234321"
                                               "123454321"
                                               " 1234321"
                                               "  12321"
                                               "   121"
                                               "    1"
                                               ]
                                              ))))

