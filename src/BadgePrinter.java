public class BadgePrinter {
    public static void main(String[] args) {
        Badge badge = new Badge();
        String badgeOwner = badge.print(59, "Julie Sokato", null);
        System.out.printf("Printed badge: %s%n", badgeOwner);
        badgeOwner = badge.print(null, "Amare Osei", null);
        System.out.printf("Printed badge: %s%n", badgeOwner);
        badgeOwner = badge.print(null, "Bogdan Rosario", "Marketing");
        System.out.printf("Printed badge: %s%n", badgeOwner);
        badgeOwner =badge.print(17, "Ryder Herbert", "Marketing");
        System.out.printf("Printed badge: %s%n", badgeOwner);
    }
}
