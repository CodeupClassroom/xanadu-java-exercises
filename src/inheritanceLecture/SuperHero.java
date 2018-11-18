package inheritanceLecture;

class SuperHero extends Person {
    private String alterEgo;

    public SuperHero(String name, int age, String alterEgo) {
        super(name, age);
        this.alterEgo = alterEgo;
    }

    public String getName() {
        return alterEgo;
    }
    public String getSecretIdentity() {
        System.out.println();
        return super.getName();
    }
}
