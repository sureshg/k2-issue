### [Reproducer for KT-62526](https://youtrack.jetbrains.com/issue/KT-62526)

* Install JDK 21
  ```bash
  $ curl -s "https://get.sdkman.io" | bash
  $ sdk i java 21-zulu
  $ sdk u java 21-zulu
  ```
* Build

  ```bash
  $ git clone https://github.com/sureshg/k2-issue
  $ cd k2-issue
  $ ./gradlew build
  # now change some file and commit it to trigger the build again
  $ ./gradlew build 
  ```
