
class A { /* ... */ }

// Классы A, B, C, D являются наследниками друг друга. 
// Чтобы соблюсти принцип OCP (Open/Closed Principle), код должен быть открыт для расширения 
// (путём наследования новых классов) и закрыт для изменения

class B extends A { /* ... */ }

class C extends B { /* ... */ }

class D extends C{ /* ... */ }