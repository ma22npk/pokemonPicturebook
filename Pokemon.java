/**
 * Pokemon
 */
class Pokemon {
  // 名前を入れる変数を定義
  public String name;
  // 分類 を入れる変数を定義
  public String category;
  // タイプ を入れる変数を定義
  public String type;
  // たかさ を入れる変数を定義
  public double height;
  // おもさ を入れる変数を定義
  public double weight;
  // 説明文 を入れる変数を定義
  public String description;

  // コンストラクタの定義
  Pokemon(String name, String category, String type, Double height, Double weight, String description) {
    this.name = name;
    this.category = category;
    this.type = type;
    this.height = height;
    this.weight = weight;
    this.description = description;
  }

  public void hello() {
    System.out.println("なまえ:" + this.name);
  }
}
