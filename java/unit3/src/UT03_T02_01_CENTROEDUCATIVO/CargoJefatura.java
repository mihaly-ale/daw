package UT03_T02_01_CENTROEDUCATIVO;

public enum CargoJefatura {
	
	NINGUNO(0), JEFE_DEPARTAMENTO(200), JEFE_DE_ESTUDIOS(300), DIRECTOR(500);
	private int bonus;
	
	private CargoJefatura(int bonus){
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}	
}
