
public class nomor4 {

    public static class Olahraga {
    public int DurasiLariDalamMenit;
    public int DurasipushUpDalamMenit;
    public int DurasiPlankDalamMenit;

    Olahraga(int DurasiLariDalamMenit,int DurasipushUpDalamMenit,int DurasiPlankDalamMenit) 
    {
      this.DurasiLariDalamMenit = DurasiLariDalamMenit;
      this.DurasipushUpDalamMenit = DurasipushUpDalamMenit;
      this.DurasiPlankDalamMenit = DurasiPlankDalamMenit;
    }
  }

  public static void main(String[] args) {
    Olahraga atlet = new Olahraga(60, 5, 3);
    getWorkoutSummary(atlet);
  }

  public static void getWorkoutSummary(Olahraga manusia) {
    final float KaloriYangHilangPerMenitSaatLari = 10;
    final float KaloriYangHilangPerMenitSaatpushUp = 6;
    final float KaloriYangHilangPerMenitSaatPlank = 3;
    
    int DurasiLari = manusia.DurasiLariDalamMenit;
    int DurasipushUp = manusia.DurasipushUpDalamMenit;
    int DurasiPlank = manusia.DurasiPlankDalamMenit;
    
    System.out.println("Lari anda menghilangkan " + (float) (KaloriYangHilangPerMenitSaatLari * DurasiLari) + " kalori");

    System.out.println("Pushup anda menghilangkan " + (float) (KaloriYangHilangPerMenitSaatpushUp * DurasipushUp) + " kalori");

    System.out.println("Plank anda menghilangkan " + (float) (KaloriYangHilangPerMenitSaatPlank * DurasiPlank) + " kalori");

  }
}