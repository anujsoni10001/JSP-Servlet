import java.util.ArrayList;

import pp.ProductBean;

public class CollectionFrameWork {
	public static void main(String hh[])
	{
	pp.ProductBean p1=new ProductBean();
	pp.ProductBean p2=new ProductBean();
	pp.ProductBean p3=new ProductBean();
	pp.ProductBean p4=new ProductBean();
	pp.ProductBean p5=new ProductBean();
	java.util.ArrayList<pp.ProductBean> a1=new ArrayList<pp.ProductBean>();
	a1.add(p1);
	a1.add(p2);
	a1.add(p3);
	a1.add(p4);
	a1.add(p5);
	for(pp.ProductBean p:a1)
	{
	p.setName("ANuju");
	p.setId("fkvnj");	
	p.setCmp("dghh");
	System.out.println(p.getName());
	System.out.println(p.getId());
	System.out.println(p.getCmp());
	}
	}
}
