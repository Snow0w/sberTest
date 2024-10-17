package com.example.sberTest;

import com.example.sberTest.controllers.RecipeController;
import com.example.sberTest.models.Ingredient;
import com.example.sberTest.models.Recipe;
import com.example.sberTest.repository.RecipeRepository;
import com.example.sberTest.services.RecipeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SberTestApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private RecipeRepository recipeRepository;

	@Autowired
	private RecipeService recipeService;

	@Autowired
	private RecipeController recipeController;

	@Test
	void recipeServiceAndControllerGetTest() throws Exception {
		Recipe recipe = new Recipe();
		recipe.setName("Черничный пирог");
		recipe.setDuration(100);
		recipe.setDescription("Описание процесса приготовления");
		recipe.setIngredients(new ArrayList<Ingredient>());
		recipe.getIngredients().add(new Ingredient(
				"Черника", 500, "Гр", "Описание ингредиента"));
		recipe.getIngredients().add(new Ingredient(
				"Мука", 160, "Гр", "Описание ингредиента"));
		recipe.getIngredients().add(new Ingredient(
				"Яйцо", 4, "Шт", "Описание ингредиента"));
		recipe.getIngredients().add(new Ingredient(
				"Соль", 1, "щепотка", "Описание ингредиента"));
		recipe.getIngredients().add(new Ingredient(
				"Caxaр", 1, "ч. ложка", "Описание ингредиента"));
		var mapper = new ObjectMapper();
		String expected = null;
		expected = mapper.writeValueAsString(recipe);
		mockMvc.perform(get("/recipe/get/{id}", 1))
				.andExpect(status().isOk())
				.andExpect(content().json(expected));
		mockMvc.perform(get("/recipe/get/{id}", -1))
				.andExpect(status().isNotFound())
				.andExpect(content().string("id not found"));
	}
}
