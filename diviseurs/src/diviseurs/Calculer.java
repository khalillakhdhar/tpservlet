package diviseurs;

public class Calculer {
private int a,b;

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}

public Calculer(int a, int b) {
	super();
	this.a = a;
	this.b = b;
}

public int pgcd()
{
int x=a; int y=b;
while(x!=y)
{
if(x>y)
	x=x-y;
else
	y=y-x;

}
return x;


}
double ppcm()
{
return (this.a * this.b) / this.pgcd();	

}
}
