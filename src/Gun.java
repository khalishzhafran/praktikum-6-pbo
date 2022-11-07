public class Gun extends Weapon {
  public int bullets;

  public Gun(int bullets) {
    this.bullets = bullets;
  }

  @Override
  public void attack() {
    if (bullets > 0) {
      bullets--;
      System.out.println("Menembakkan peluru");
      System.out.println("Sisa peluru: " + bullets);
      if (bullets == 9)
        System.out.println("Senjata");
    } else {
      System.out.println("Peluru habis!");
      System.out.println("Reload...");
      reload();
    }
  }

  public void reload() {
    this.bullets += 10;
  }
}
