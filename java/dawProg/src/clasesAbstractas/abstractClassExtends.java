package clasesAbstractas;

abstract class A {
	abstract void foo();

	abstract void bar();
}

abstract class B extends A {
	// OK: still abstract, no need to implement foo()

	// => NOTE: bar
	void bar() {
		System.out.println("Implemented bar in B (abstract)");
	}
}

class C extends B {
	// => foo
	void foo() {
		System.out.println("Implemented foo in C (concrete).");
	}

	@Override // - palabra clave recomendable*, no obligatoria
	void bar() {
		super.bar();
		System.out.println("Implemented bar in C (concrete).");
	}

}

public class abstractClassExtends {
	public static void main(String[] args) {

		C c = new C();

		c.foo();
		c.bar();

	}
}

// * NOTE: genera automaticamenete - Source/Override implement methods
// Compiler checks you’re actually overriding something
// Prevents mistakes (e.g., wrong method signature)
/// void Bar() { } // typo (capital B)
// => Without @Override → compiles (new method)
// => With @Override → ❌ compile error (catches the bug)