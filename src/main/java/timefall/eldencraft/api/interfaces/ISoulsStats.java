package timefall.eldencraft.api.interfaces;

public interface ISoulsStats {
    int getLevel();
    int getVigor();
    int getMind();
    int getEndurance();
    int getStrength();
    int getDexterity();
    int getIntelligence();
    int getFaith();
    int getArcane();
    int getHP();
    int getFP();
    int getStamina();
    int getMaxHP();
    int getMaxFP();
    int getMaxStamina();

    void setLevel(int level);
    void setVigor(int vigor);
    void setMind(int mind);
    void setEndurance(int endurance);
    void setStrength(int strength);
    void setDexterity(int dexterity);
    void setIntelligence(int intelligence);
    void setFaith(int faith);
    void setArcane(int arcane);
    void setHp(int hp);
    void setFp(int fp);
    void setStamina(int stamina);
    void setMaxHp(int maxHp);
    void setMaxFp(int maxFp);
    void setMaxStamina(int maxStamina);
}
