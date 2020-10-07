class Main {
  public static void main(String[] args) {
    // モクロー
    Pokemon pokemon1 = new Pokemon("モクロー", "くさばね", "くさ", "ひこう", 0.3, 1.5,
        "羽音を立てずに空を飛ぶことができる。相手に気づかれずに近づいて強力な脚蹴りを繰り出したり、カッターのように鋭い切れ味の葉っぱと一体になった羽根を飛ばして、遠くから攻撃したりできるぞ！");
    pokemon1.printData();
    // ニャビー
    Pokemon pokemon2 = new Pokemon("ニャビー", "ひねこ", "ほのお", 0.4, 4.3, "ニャビーはいつも冷静で、感情を表に出さない。しかし、トレーナーや仲間がピンチに追い込まれた時は、全力で助けるぞ！");

    pokemon2.printData();
    // アシマリ
    Pokemon pokemon3 = new Pokemon("アシマリ", "あしか", "みず", 0.4, 7.5,
        "アシマリは、鼻息を使って水のバルーンを作ることができる。バトルでは、そのバルーンを使ったさまざまな戦術を繰り出すのだ！");
    pokemon3.printData();
  }

}
