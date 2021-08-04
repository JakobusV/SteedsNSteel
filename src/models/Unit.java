package models;

public class Unit {
    private String name;
    private int _hp;
    private int _atk;
    private int _def;

    public Unit(int _hp, int _atk, int _def) {
        set_hp(_hp);
        set_atk(_atk);
        set_def(_def);
    }

    public int get_hp() {
        return _hp;
    }

    public void set_hp(int _hp) {
        this._hp = _hp;
    }

    public int get_atk() {
        return _atk;
    }

    public void set_atk(int _atk) {
        this._atk = _atk;
    }

    public int get_def() {
        return _def;
    }

    public void set_def(int _def) {
        this._def = _def;
    }
}
