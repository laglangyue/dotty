import scala.quoted._

def f[A: Type](e: Expr[A])(using Quotes): Expr[A] = e match {
  case '{ $e2 } => e2
}
