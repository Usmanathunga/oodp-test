import org.com.filestore.InMenoryNameStrore;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class InMenoryNameStroreTest {

   //Unit Testing
  @Test
  public void should_ReturnEmptyName_when_CreatAnInstance(){
      InMenoryNameStrore store = new InMenoryNameStrore();
      assertThat(store.getName(), is(empty()));

  }
  @Test
    public void should_Store_when_NameIsGiven(){
     InMenoryNameStrore store = new InMenoryNameStrore();
     store.store("Nimal");
     assertThat(store.getName(),hasSize(1));

  }
  @Test
    public void should_GetName_when_AStoreNameIsAvalabel(){
      InMenoryNameStrore store = new InMenoryNameStrore();
      store.store("Kamal");
      assertThat(store.getName(),contains("Kamal"));
  }
  @Test
    public void should_GetAllName_when_StoreHasManyName(){
      InMenoryNameStrore store = new InMenoryNameStrore();
      store.store("Sunil");
      store.store("Redhood");
      assertThat(store.getName(),containsInAnyOrder("Redhood","Sunil"));

  }




}
