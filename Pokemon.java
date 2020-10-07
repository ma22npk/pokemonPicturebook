/**
 * Pokemon
 */
class Pokemon {
  // 名前を入れる変数を定義
  private String name;
  // 分類 を入れる変数を定義
  private String category;
  // タイプ を入れる変数を定義
  private String type1;
  // タイプ を入れる変数を定義
  private String type2;
  // たかさ を入れる変数を定義
  // おもさ を入れる変数を定義
  private double height, weight;
  // 説明文 を入れる変数を定義
  private String description;

  // コンストラクタの定義
  // タイプが一つだけの時のコンストラクタ
  Pokemon(String name, String category, String type1, double height, double weight, String description) {
    this.name = name;
    this.category = category;
    this.type1 = type1;
    this.height = height;
    this.weight = weight;
    this.description = description;
  }

  // タイプが 2つの時のコンストラクタ
  Pokemon(String name, String category, String type1, String type2, double height, double weight, String description) {
    this(name, category, type1, height, weight, description);
    this.type2 = type2;
  }

  public String getType2() {
    return this.type2;
  }

  public String fullType() {
    if (this.type2 == null) {
      return "タイプ:" + this.type1;
    } else {
      return "タイプ:" + this.type1 + " " + this.type2;
    }
  }

  public void printData() {
    System.out.println("------------------------");
    System.out.println("なまえ:" + this.name);
    System.out.println(this.category + "ポケモン");
    System.out.println(fullType());
    System.out.println("たかさ" + this.height + "m");
    System.out.println("おもさ" + this.weight + "kg");
    System.out.println(this.description);

  }

}
