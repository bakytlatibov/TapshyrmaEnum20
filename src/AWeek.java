public enum AWeek {
    MONDAY ("Дуйшомбу куну жава праграммалоо сабагын окуйм"),
    TUESDAY("Шейшемби куну бизде техникалык англис тили сабагы болот"),
    WEDNESDAY("Шаршемби куну Жава тбоюнча жаны сабак"),
    THURSDAY("Бейшемби куну практикалык сабак "),
    FRIDAY("Жума куну жаны тема отобуз"),
    SATURDAY("Ишемби куну жаны тема боюнча практикалык сабак болот"),
    SUNDAY("Жекшемби куну бизде эс алуу");
   private String kundukPlan;
AWeek(String kundukPlan){
    this.kundukPlan=kundukPlan;


}

    public String getKundukPlan() {
        return kundukPlan;
    }

    @Override
    public String toString() {
        return "AWeek{" +
                "kundukPlan='" + kundukPlan + '\'' +
                '}';
    }
}
