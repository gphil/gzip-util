# gzip-util

Some utility functions for working with gzip in Clojure. Uses
java.util.zip.GZIPInputStream and GZIPOutputStream under the hood.

## Usage

Current leiningen dependency:

```clojure

[gzip-util "0.1.0-SNAPSHOT"]
```

```clojure

;; gzip a string:

(str->gzipped-bytes "string to compress")

;; un-gzip a java.io.InputStream, returning a UTF-8 encoded string:

(gzipped-input-stream->str input-stream "UTF-8")

```

## License

Copyright © 2013 Greg Phillips

Distributed under the Eclipse Public License, the same as Clojure.
