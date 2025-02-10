# PWS Android

# 1.0.0 (2025-02-10)


### Bug Fixes

* add build script; prepare for new public release ([#49](https://github.com/MykhailoDmytriakha/pws-android/issues/49)) ([157ebd3](https://github.com/MykhailoDmytriakha/pws-android/commit/157ebd32ff2a0ee2231dcf439d4c15c9eb7e7e31))
* **app:** fix song text html builder ([04c6d7f](https://github.com/MykhailoDmytriakha/pws-android/commit/04c6d7f0d253cc5936968ee51c978f2fbdb460c1))
* **books:** fix books fragment switching issue ([e6de927](https://github.com/MykhailoDmytriakha/pws-android/commit/e6de927c5ba185206dff5d8ed140a73c5b7341e4))
* configure domain package publication ([#50](https://github.com/MykhailoDmytriakha/pws-android/issues/50)) ([8e0af70](https://github.com/MykhailoDmytriakha/pws-android/commit/8e0af70cc35d399bbc8ec549b34c150fc73f5d65))
* **database:** configure database migration for import/export feature ([#41](https://github.com/MykhailoDmytriakha/pws-android/issues/41)) ([fe183b2](https://github.com/MykhailoDmytriakha/pws-android/commit/fe183b20935993a543cc0db42068654e07948596))
* **database:** database refactoring: remove redundant dao methods ([7a078ad](https://github.com/MykhailoDmytriakha/pws-android/commit/7a078ade9ffa7a62715653fa461d587c5d30c31e))
* **database:** fix android 10 issues. ([3c5b2f7](https://github.com/MykhailoDmytriakha/pws-android/commit/3c5b2f770f9ff708c51416ad2cb79db2b1e2f8b8))
* **database:** fix app starting with empty database ([#45](https://github.com/MykhailoDmytriakha/pws-android/issues/45)) ([02c1d70](https://github.com/MykhailoDmytriakha/pws-android/commit/02c1d706ee744ee11f92f70fefcb1c48fe994daf))
* **database:** Fix data provider issue. Update project libraries ([7934f8e](https://github.com/MykhailoDmytriakha/pws-android/commit/7934f8eb11ee881cf1a56b5092fe82d8d56330ff))
* **database:** optimize build scripts ([de2694a](https://github.com/MykhailoDmytriakha/pws-android/commit/de2694a38ff7da9446912b691e087a0159c19357))
* **db:** Fix app issues ([0c5eff0](https://github.com/MykhailoDmytriakha/pws-android/commit/0c5eff0ef5dbacf22f37bf379b4ecb23312c7ea8))
* Fix app issues. ([29e349e](https://github.com/MykhailoDmytriakha/pws-android/commit/29e349eceab5eb7edea0cec2b1391c6bcf89bb08))
* Fix preferences activity & fragments. ([0e9abf5](https://github.com/MykhailoDmytriakha/pws-android/commit/0e9abf5115a978da32a07c8bfba79bed4bbc4e2e))
* **preferences:** remove donate fragment ([54ee529](https://github.com/MykhailoDmytriakha/pws-android/commit/54ee529ac5bc4fd3a62e2662f235fa9339204556))
* **publish:** configure release publishing ([29ddea2](https://github.com/MykhailoDmytriakha/pws-android/commit/29ddea2b93f71c95c17dba09f052fc6eb99dd177))
* **publishing:** fix maven publishing ([f6c2885](https://github.com/MykhailoDmytriakha/pws-android/commit/f6c28852d3aa80781b803a6c4c761f190f55eadc))
* **publishing:** fix maven publishing (include jvmJar artifact) ([d509d85](https://github.com/MykhailoDmytriakha/pws-android/commit/d509d858a7c540de140255706e06ace1e7a511f8))
* **search:** fix case-insensitive search ([#55](https://github.com/MykhailoDmytriakha/pws-android/issues/55)) ([6498749](https://github.com/MykhailoDmytriakha/pws-android/commit/64987498e68310addc16340a2f03e30f47404628))
* **share:** fix issue: copying wrong song from context menu ([#43](https://github.com/MykhailoDmytriakha/pws-android/issues/43)) ([af1114b](https://github.com/MykhailoDmytriakha/pws-android/commit/af1114b84bde242b7bb8cd26bf40f31a9b7afb2b))
* update library versions ([#56](https://github.com/MykhailoDmytriakha/pws-android/issues/56)) ([be27b34](https://github.com/MykhailoDmytriakha/pws-android/commit/be27b346e012da75f5bc714fa3b87075a2bcf145))


### Features

* **app:** reimplement books fragment using room dao ([4346070](https://github.com/MykhailoDmytriakha/pws-android/commit/4346070fe6e34985b59cae36b02fd9157aec8740))
* **app:** reimplement history and favorites fragment using room dao ([71ea5c2](https://github.com/MykhailoDmytriakha/pws-android/commit/71ea5c2ee01a640d7ece16c57eaecb5bfe025f74))
* **backup:** backup feature refactoring ([#48](https://github.com/MykhailoDmytriakha/pws-android/issues/48)) ([e544c4d](https://github.com/MykhailoDmytriakha/pws-android/commit/e544c4db874bb349569cc80ec4dca89f131a982a))
* **books:** add books menu icon ([144a0ef](https://github.com/MykhailoDmytriakha/pws-android/commit/144a0efdc692a9d0030eeb4d39566cf0a2dd544f))
* **database:** implement db v1.2.0 migration to db v1.3.0 ([0f9f9a4](https://github.com/MykhailoDmytriakha/pws-android/commit/0f9f9a428036d274a567472941d5bd4e270e6c65))
* **database:** implement db v1.2.0 migration to db v1.3.0 ([aa60208](https://github.com/MykhailoDmytriakha/pws-android/commit/aa602084fc32b7636dfa270d4ecf7bcd0d4a5a6d))
* **database:** implement jvm database ([48c073c](https://github.com/MykhailoDmytriakha/pws-android/commit/48c073c737c4b5e6fe389611bcb94d0f7952f4ff))
* **database:** implement room entities and daos ([a19c6c1](https://github.com/MykhailoDmytriakha/pws-android/commit/a19c6c1d4faf7d48bab22320cafa58ffbe5d6896))
* **database:** try to implement room DAOs ([7ed8cb2](https://github.com/MykhailoDmytriakha/pws-android/commit/7ed8cb22313d28a647d1d60a364229ca84f93934))
* **db:** support new database version (v1.8.0) ([251dc8c](https://github.com/MykhailoDmytriakha/pws-android/commit/251dc8cfedd2bf472d082db2d461ae5c7ccb4e37))

## [1.11.4](https://github.com/alelk/pws-android/compare/v1.11.3...v1.11.4) (2025-02-04)


### Bug Fixes

* update library versions ([#56](https://github.com/alelk/pws-android/issues/56)) ([be27b34](https://github.com/alelk/pws-android/commit/be27b346e012da75f5bc714fa3b87075a2bcf145))

## [1.11.3](https://github.com/alelk/pws-android/compare/v1.11.2...v1.11.3) (2025-02-03)


### Bug Fixes

* **search:** fix case-insensitive search ([#55](https://github.com/alelk/pws-android/issues/55)) ([6498749](https://github.com/alelk/pws-android/commit/64987498e68310addc16340a2f03e30f47404628))

## [1.11.2](https://github.com/alelk/pws-android/compare/v1.11.1...v1.11.2) (2025-01-02)


### Bug Fixes

* configure domain package publication ([#50](https://github.com/alelk/pws-android/issues/50)) ([8e0af70](https://github.com/alelk/pws-android/commit/8e0af70cc35d399bbc8ec549b34c150fc73f5d65))

## [1.11.1](https://github.com/alelk/pws-android/compare/v1.11.0...v1.11.1) (2025-01-01)


### Bug Fixes

* add build script; prepare for new public release ([#49](https://github.com/alelk/pws-android/issues/49)) ([157ebd3](https://github.com/alelk/pws-android/commit/157ebd32ff2a0ee2231dcf439d4c15c9eb7e7e31))

# [1.11.0](https://github.com/alelk/pws-android/compare/v1.10.7...v1.11.0) (2025-01-01)


### Features

* **backup:** backup feature refactoring ([#48](https://github.com/alelk/pws-android/issues/48)) ([e544c4d](https://github.com/alelk/pws-android/commit/e544c4db874bb349569cc80ec4dca89f131a982a))

## [1.10.7](https://github.com/alelk/pws-android/compare/v1.10.6...v1.10.7) (2024-12-30)


### Bug Fixes

* **database:** fix app starting with empty database ([#45](https://github.com/alelk/pws-android/issues/45)) ([02c1d70](https://github.com/alelk/pws-android/commit/02c1d706ee744ee11f92f70fefcb1c48fe994daf))

## [1.10.6](https://github.com/alelk/pws-android/compare/v1.10.5...v1.10.6) (2024-12-30)


### Bug Fixes

* **database:** configure database migration for import/export feature ([#41](https://github.com/alelk/pws-android/issues/41)) ([fe183b2](https://github.com/alelk/pws-android/commit/fe183b20935993a543cc0db42068654e07948596))

## [1.10.5](https://github.com/alelk/pws-android/compare/v1.10.4...v1.10.5) (2024-12-18)


### Bug Fixes

* **share:** fix issue: copying wrong song from context menu ([#43](https://github.com/alelk/pws-android/issues/43)) ([af1114b](https://github.com/alelk/pws-android/commit/af1114b84bde242b7bb8cd26bf40f31a9b7afb2b))

## [1.10.4](https://github.com/alelk/pws-android/compare/v1.10.3...v1.10.4) (2024-10-18)


### Bug Fixes

* **database:** optimize build scripts ([de2694a](https://github.com/alelk/pws-android/commit/de2694a38ff7da9446912b691e087a0159c19357))

## [1.10.3](https://github.com/alelk/pws-android/compare/v1.10.2...v1.10.3) (2024-10-18)


### Bug Fixes

* **database:** database refactoring: remove redundant dao methods ([7a078ad](https://github.com/alelk/pws-android/commit/7a078ade9ffa7a62715653fa461d587c5d30c31e))

## [1.10.2](https://github.com/alelk/pws-android/compare/v1.10.1...v1.10.2) (2024-10-18)


### Bug Fixes

* **publishing:** fix maven publishing (include jvmJar artifact) ([d509d85](https://github.com/alelk/pws-android/commit/d509d858a7c540de140255706e06ace1e7a511f8))

## [1.10.1](https://github.com/alelk/pws-android/compare/v1.10.0...v1.10.1) (2024-10-18)


### Bug Fixes

* **publishing:** fix maven publishing ([f6c2885](https://github.com/alelk/pws-android/commit/f6c28852d3aa80781b803a6c4c761f190f55eadc))

# [1.10.0](https://github.com/alelk/pws-android/compare/v1.9.1...v1.10.0) (2024-10-18)


### Features

* **database:** implement jvm database ([48c073c](https://github.com/alelk/pws-android/commit/48c073c737c4b5e6fe389611bcb94d0f7952f4ff))

## [1.9.1](https://github.com/alelk/pws-android/compare/v1.9.0...v1.9.1) (2024-10-17)


### Bug Fixes

* **publish:** configure release publishing ([29ddea2](https://github.com/alelk/pws-android/commit/29ddea2b93f71c95c17dba09f052fc6eb99dd177))

# [1.9.0](https://github.com/alelk/pws-android/compare/v1.8.0...v1.9.0) (2024-10-17)


### Features

* **app:** reimplement books fragment using room dao ([4346070](https://github.com/alelk/pws-android/commit/4346070fe6e34985b59cae36b02fd9157aec8740))
* **app:** reimplement history and favorites fragment using room dao ([71ea5c2](https://github.com/alelk/pws-android/commit/71ea5c2ee01a640d7ece16c57eaecb5bfe025f74))
* **database:** implement room entities and daos ([a19c6c1](https://github.com/alelk/pws-android/commit/a19c6c1d4faf7d48bab22320cafa58ffbe5d6896))
