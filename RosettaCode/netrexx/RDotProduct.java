/* Generated from 'RDotProduct.nrx' 8 Sep 2011 10:22:22 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */




public class RDotProduct{
 private static final java.lang.String $0="RDotProduct.nrx";
 
 public static void main(java.lang.String $0s[]){
  double whatsTheVectorVictor[][];
  netrexx.lang.Rexx dotProduct;
  whatsTheVectorVictor=new double[][]{new double[]{(double)1.0D,3.0D,-5.0D},new double[]{(double)4.0D,-2.0D,-1.0D}};
  dotProduct=new netrexx.lang.Rexx(dotProduct(whatsTheVectorVictor));
  netrexx.lang.RexxIO.Say(dotProduct.format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)2)));
  
  return;
  }

 
 public static final double dotProduct(double vec1[],double vec2[]) throws java.lang.IllegalArgumentException{
  double scalarProduct;
  int e_=0;
  double product=0;
  if (vec1.length!=vec2.length) 
   throw new java.lang.IllegalArgumentException("Vectors must be the same length");
  
  scalarProduct=(double)0.0D;
  {int $1=vec1.length-1;e_=0;e_:for(;e_<=$1;e_++){
   product=vec1[e_]*vec2[e_];
   scalarProduct=product+scalarProduct;
   }
  }/*e_*/
  
  return scalarProduct;
  }

 
 public static final double dotProduct(double vecs[][]) throws java.lang.IllegalArgumentException{
  return dotProduct(vecs[0],vecs[1]);
  }
 
 private RDotProduct(){return;}
 }
