package com.cesi.heroes.domain;

public enum EIncident {
    INCENDIE(0, "Incendie"),
    ACCIDENT_ROUTIER(1, "Accident routier"),
    ACCIDENT_FLUVIAL(2, "Accident fluvial"),
    ACCIDENT_AERIEN(3, "Accident aérien"),
    EBOULEMENT(4, "Éboulement"),
    INVASION_DE_SERPENT(5, "Invasion de serpent"),
    FUITE_DE_GAZ(6, "Fuite de gaz"),
    MANIFESTATION(7, "Manifestation"),
    BRAQUAGE(8, "Braquage"),
    EVASION_DUN_PRISONNIER(9, "Évasion d'un prisonnier");

    private final int id;
    private final String label;

    private EIncident(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public int getId() {
        return this.id;
    }

    public String getLabel() {
        return this.label;
    }

    public static void main(String[] args) {
        for (EIncident EIncident : EIncident.values()) {
            System.out.println(EIncident.label);
        }
    }
}
