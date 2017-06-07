/* Generated from 'RClasses.nrx' 2 Jul 2011 15:18:10 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * In <a href="http://rosettacode.org/wiki/Object-oriented_programming">object-oriented programming</a>
 * <strong>class</strong> is a set (a <a href="http://en.wikipedia.org/wiki/Transitive_closure">transitive closure</a>)
 * of types bound by the relation of <a href="http://rosettacode.org/wiki/Inheritance">inheritance</a>. It is said that
 * all types derived from some base type T and the type T itself form a class T.
 * The first type T from the class T sometimes is called the <strong>root type</strong> of the class.
 * <p>
 * A class of types itself, as a type, has the values and operations of its own.
 * The operations of are usually called <strong>methods</strong> of the root type.
 * Both operations and values are called <a href="http://rosettacode.org/wiki/Polymorphism">polymorphic</a>.
 * </p>
 * <p>
 * A polymorphic operation (method) selects an implementation depending on the actual specific type of the polymorphic
 * argument. The action of choice the type-specific implementation of a polymorphic operation is called
 * <strong>dispatch</strong>.
 * Correspondingly, polymorphic operations are often called <strong>dispatching<.strong> or <strong>virtual<.strong>.
 * Operations with multiple arguments and/or the results of the class are called <strong>multi-methods</strong>.
 * A further generalization of is the operation with arguments and/or results from different classes.
 * <ul>
 * <li>
 * single-dispatch languages are those that allow only one argument or result to control the dispatch.
 * Usually it is the first parameter, often hidden, so that a prefix notation <i>x.f()</i> is used instead of
 * mathematical <i>f(x)</i>.
 * </li>
 * <li>
 * multiple-dispatch languages allow many arguments and/or results to control the dispatch.
 * </li>
 * </ul>
 * <p>
 * A polymorphic value has a type tag indicating its specific type from the class and the corresponding specific value
 * of that type. This type is sometimes called the <strong>most specific type</strong> of a [polymorphic] value.
 * The type tag of the value is used in order to resolve the dispatch. The set of polymorphic values of a class is
 * a transitive closure of the sets of values of all types from that class.
 * </p>
 * <p>
 * In many <a href="http://rosettacode.org/wiki/Object-oriented_programming">OO</a> languages the type of the class of
 * T and T itself are considered equivalent.
 * In some languages they are distinct (like in <a href="http://rosettacode.org/wiki/Ada">Ada</a>).
 * When class T and T are equivalent, there is no way to distinguish polymorphic and specific values.
 * </p>
 * <p>
 * The purpose of this task is to create a basic class with a method, a constructor, an instance variable and how to
 * instantiate it.
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Classes">rosettacode.org/wiki/Classes</a> 
 */


public class RClasses{
 private static final java.lang.String $0="RClasses.nrx";
 
 /* properties private */ // class scope
 private int foo;
 
 /* properties public */ // publicly visible
 public boolean bar;
 
 /* properties indirect */ // generates bean patterns
 private java.lang.String baz=new java.lang.String();

 
 
 public static void main(java.lang.String args[]){
  RClasses clsex; // main method
  clsex=new RClasses(); // instantiate
  clsex.foo=42;
  clsex.baz="forty-two";
  clsex.bar=false; // boolean false
  clsex.test(clsex.foo);
  clsex.test(clsex.bar);
  clsex.test(clsex.baz);
  return;}

 
 public void test(int s){
  int aap;
  aap=1; // local (stack) variable
  netrexx.lang.RexxIO.Say(java.lang.String.valueOf(s)+" "+aap);
  return;}

 
 public void test(java.lang.String s){
  int noot;
  noot=2;
  netrexx.lang.RexxIO.Say(s+" "+noot);
  return;}

 
 public void test(boolean s){
  int mies;
  mies=3;
  return;}
 
 public java.lang.String getBaz(){return baz;}
 
 public void setBaz(java.lang.String $1){baz=$1;return;}
 
 public RClasses(){return;}
 }
