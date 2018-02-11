package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private static Category category;
	
	@BeforeClass
	public static void init(){
		
		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
		
	}
	
	/*@Test
	public void testAddCategory(){
		
		category = new Category();
		category.setName("Television");
		category.setDescription("This is some description for television");
		category.setImageURL("CAT_4.png");
		
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
	}*/
	
	/*@Test
	public void testGetCategory(){
		
		category = categoryDAO.get(3);
		
		assertEquals("Successfully fetched single category from the table!","Mobile",category.getName());
		
	}
	*/
	
	/*@Test
	public void testUpdateCategory(){
		
		category = categoryDAO.get(2);
		category.setName("TV");
		
		assertEquals("Successfully updated a single category in the table!",true,categoryDAO.update(category));
		
	}
	*/
	
	/*@Test
	public void testDeleteCategory(){
		
		category = categoryDAO.get(2);

		assertEquals("Successfully deleted a single category in the table!",true,categoryDAO.delete(category));
		
	}
	*/
	
	/*@Test
	public void testListCategory(){

		assertEquals("Successfully fetched list of category from the table!",3,categoryDAO.list().size());
		
	}
	*/
	
	@Test
	public void testCRUDCategory(){
		
		//add operation
		//1>
		category = new Category();
		category.setName("Laptop");
		category.setDescription("This is some description for laptop");
		category.setImageURL("CAT_1.png");
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
		//2>
		category = new Category();
		category.setName("Television");
		category.setDescription("This is some description for television");
		category.setImageURL("CAT_2.png");
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
		
		
		//update operation
		category = categoryDAO.get(2);
		category.setName("TV");		
		assertEquals("Successfully updated a single category in the table!",true,categoryDAO.update(category));
		
		
		//delete operation
		category = categoryDAO.get(2);
		assertEquals("Successfully deleted a single category in the table!",true,categoryDAO.delete(category));
		
		//fetch operation
		assertEquals("Successfully fetched list of category from the table!",1,categoryDAO.list().size());
		
		
	}
	
	
	
	
}
