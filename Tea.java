class Tea
{
 private TeaFactory TeaFactory;

 public void setTeaFactory(TeaFactory 
 tea)
 {
 this.TeaFactory = tea;
 }

 public TeaFactory getTeaFactory()
 {
 return TeaFactory;
 }

 public void gotoTea()
 {
    TeaFactory.gotoTea();
 }

}