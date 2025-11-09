import unittest
class Test_Calculadora(unittest.TestCase):

    def setUp(self):
        self.calc = Calculadora()

    def test_somar(self):
        resultado = self.calc.somar(2, 3)
        self.assertEqual(resultado, 5, "2 + 3 deve ser 5")

    def test_subtrair(self):
        resultado = self.calc.subtrair(5, 2)
        self.assertEqual(resultado, 3, "5 - 2 deve ser 3")

    def test_multiplicar(self):
        resultado = self.calc.multiplicar(4, 5)
        self.assertEqual(resultado, 20, "4 * 5 deve ser 20")

    def test_dividir(self):
        resultado = self.calc.dividir(10, 2)
        self.assertAlmostEqual(resultado, 5.0, places=3, msg="10 / 2 deve ser 5.0")

    def test_dividir_por_zero(self):
        with self.assertRaises(ValueError):
            self.calc.dividir(10, 0)

if __name__ == '__main__':
    unittest.main()