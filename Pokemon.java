/**
 * Pokemon
 */
class Pokemon {
  // 名前を入れる変数を定義
  public String name;

  // コンストラクタの定義
  Pokemon() {
    System.out.println("インスタンスが生成されました");
  }

  public void hello() {
    System.out.println("なまえ" + this.name);
  }

}
