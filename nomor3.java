public class nomor3 {
  public static void main(String[] args) {
    int nomorPunggung = 57;
    String posisi = "";
    // bilangan genap
    if (nomorPunggung % 2 == 0) {
      posisi += "Target Attacker";
      if (nomorPunggung >= 50 && nomorPunggung <= 100) {
        posisi += " - Calon Capten team";
      }
    }
    // bilangan ganjil
    if (nomorPunggung % 2 == 1) {
      posisi += "Defender";
      if (nomorPunggung > 90) {
        posisi += " - Playmaker";
      }
    }
    // bilangan ganjil kelipatan 3 dan 5
    if (nomorPunggung % 3 == 0 || nomorPunggung % 5 == 0) {
      posisi += " - Keeper";
    }
      System.out.println(posisi);
  }
}