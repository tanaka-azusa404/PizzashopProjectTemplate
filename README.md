# PizzashopProjectTemplate

## チーム名とメンバー

### チーム名
Pizza Innovators

### メンバー
- **山田 太郎 (Taro Yamada)**: リーダー!!
- **佐藤 花子 (Hanako Sato)**: サブリーダー
- **鈴木 一郎 (Ichiro Suzuki)**: テクニカルアドバイザ
- **田中 次郎 (Jiro Tanaka)**: ドキュメント管理

## 1.プロジェクトの概要

#### 1. プロジェクト名

注文受付業務改善プロジェクト

#### プロジェクトの目的

ピザ屋さんの注文受付業務システムを開発する

#### プロジェクト体制

- 開発メンバー:4 名
- **山田 太郎 (Taro Yamada)**: リーダー
- **佐藤 花子 (Hanako Sato)**: サブリーダー
- **鈴木 一郎 (Ichiro Suzuki)**: テクニカルアドバイザ
- **田中 次郎 (Jiro Tanaka)**: ドキュメント管理

#### プロジェクト行程

- 開発開始日:2024/11/20
- リリース予定日:2024/12/5
- プロジェクト内容習熟:~2024/mm/dd
- ソフトウェア詳細設計:~2024/mm/dd
- ソフトウェアコード作成及びテスト:~2024/mm/dd
- ソフトウェア結合:~2024/mm/dd
- 検収:~2024/mm/dd
- 発表:~2024/mm/dd

## 4.ディレクトリ構成

```
.
│  
└─PizzashopProjectTemplate
    │  README.md
    │  
    ├─.github
    │  ├─ISSUE_TEMPLATE
    │  └─workflows
    ├─01_src
    │  ├─main
    │  │  └─java
    │  │      │  KIDDA-LA.jpg
    │  │      │  
    │  │      └─jp
    │  │          └─ac
    │  │              └─yic
    │  │                  └─kiddala
    │  │                      ├─action
    │  │                      │      CustomerModifyAction.java
    │  │                      │      CustomerSearchDisplayAction.java
    │  │                      │      DeliveryCompleteAction.java
    │  │                      │      DeliveryConfirmAction.java
    │  │                      │      ItemMenuDisplayAction.java
    │  │                      │      MainMenuDisplayAction.java
    │  │                      │      OrderInputDisplayAction.java
    │  │                      │      OrderRegisterAction.java
    │  │                      │      PrintOutAction.java
    │  │                      │      
    │  │                      ├─control
    │  │                      │      KiddaLaController.java
    │  │                      │      
    │  │                      ├─dao
    │  │                      │      CustomerModifyDBAccess.java
    │  │                      │      DeliveryCompleteDBAccess.java
    │  │                      │      DeliveryConfirmDBAccess.java
    │  │                      │      ItemMenuDisplayDBAccess.java
    │  │                      │      OrderConfirmDBAccess.java
    │  │                      │      OrderInputDisplayDBAccess.java
    │  │                      │      OrderRegisterDBAccess.java
    │  │                      │      TaxSearchDBAccess.java
    │  │                      │      
    │  │                      ├─model
    │  │                      │      Item.java
    │  │                      │      OrderControlUtility.java
    │  │                      │      OrderControlUtility2.java
    │  │                      │      OrderDetail.java
    │  │                      │      Tax.java
    │  │                      │      
    │  │                      ├─stert
    │  │                      │      KiddaLaEntry.java
    │  │                      │      
    │  │                      └─view
    │  │                              CustomerSearchFrame.java
    │  │                              DeliveryConfirmFrame.java
    │  │                              MainMenuFrame.java
    │  │                              OrderInputFrame.java
    │  │                              
    │  └─test
    │      └─java
    │          └─jp
    │              └─ac
    │                  └─yic
    │                      └─kiddala
    │                          ├─jointest
    │                          └─unittest
    ├─02_lib
    ├─03_daily-reports
    │  ├─member1
    │  ├─member2
    │  ├─member3
    │  └─member4
    ├─04_meeting-minutes
    ├─05_specs
    │  ├─01_requirements
    │  ├─02_design
    │  ├─03_sequence-diagrams
    │  ├─04_class-diagrams
    │  ├─05_unit-test-specs
    │  ├─06_integration-test-specs
    │  │      joinTest.md
    │  │      
    │  └─07_review-records
    └─06_error-reports
        └─error-reports

```

### ディレクトリ説明
- `.github/`: GitHub関連の設定ファイル
  - `ISSUE_TEMPLATE/`: Issueテンプレート
  - `workflows/`: GitHub Actionsのワークフロー
- `01_src/`: ソースコード
  - `main/java/jp/ac/yic/kiddala/`: メインのJavaコード
    - `action/`: アクション関連のコード
    - `control/`: コントローラー関連のコード
    - `dao/`: データアクセスオブジェクト
    - `model/`: モデルクラス
    - `stert/`: スタートアップ関連のコード
    - `view/`: ビュー関連のコード
  - `test/java/jp/ac/yic/kiddala/`: テストコード
    - `jointest/`: 結合テスト
    - `unittest/`: 単体テスト
- `02_lib/`: ライブラリ
- `03_daily-reports/`: 日報
  - `member1/`: メンバー1の日報
  - `member2/`: メンバー2の日報
  - `member3/`: メンバー3の日報
  - `member4/`: メンバー4の日報
- `04_meeting-minutes/`: 会議議事録
- `05_specs/`: 仕様書
  - `01_requirements/`: 要件定義書
  - `02_design/`: 設計書
  - `03_sequence-diagrams/`: シーケンス図
  - `04_class-diagrams/`: クラス図
  - `05_unit-test-specs/`: 単体テスト仕様書
  - `06_integration-test-specs/`: 結合テスト仕様書
  - `07_review-records/`: レビュー記録
- `06_error-reports/`: エラーレポート
  - `error-reports/`: エラーレポートファイル
  
## 注意
### ソフトウェアコード作成時の注意点

「顧客情報を検索する」機能のソフトウェアコード作成は次のように行います。

- `Customer`クラスは`model`パッケージに新規作成する
- `CustomerSearchDBAccess`クラスは`dao`パッケージに新規作成する
- `CustomerSearchAction`クラスは`action`パッケージに新規作成する
- `KiddaLaController`クラスは`control`パッケージにすでに存在する同じ名前のクラスに`customerSearch()`メソッドを追加する
