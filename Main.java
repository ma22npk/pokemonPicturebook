class Main {
  public static void main(String[] args) {
    Pokemon pokemon1 = new Pokemon("フシギダネ", "たねポケモン", "くさ", 0.7, 6.9,
        "大きな種を背負っているくさタイプのポケモン。この種は生まれた時から背中に植わっており、生後しばらくは種から養分を得て成長する。");
    System.out.println(pokemon1.name);
    System.out.println(pokemon1.category);
    System.out.println(pokemon1.type);
    System.out.println(pokemon1.height);
    System.out.println(pokemon1.weight);
    System.out.println(pokemon1.description);

  }

}
