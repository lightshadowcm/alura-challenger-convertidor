public record Monedas(String base_code,
                      String target_code,
                      double conversion_result) {

    @Override
    public String toString() {
        return "de " + base_code + " " + " equivale a:$" +
                conversion_result + " de " + target_code + ".";
    }
}
