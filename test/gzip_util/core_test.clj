(ns gzip-util.core-test
  (:use clojure.test
        gzip-util.core))

(deftest str-round-trip
  (testing "Round trip a UTF-8 encoded string through
  str->gzipped-bytes and gzipped-input-stream->str."
    (let [test-str "√2"]
      (is (=  test-str
              (gzipped-input-stream->str
               (java.io.ByteArrayInputStream.
                (str->gzipped-bytes test-str)) "UTF-8"))))))
