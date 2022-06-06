public CommonResult listIndividualRecipe(Integer registrationId){
        List<HashMap> recipe = recipeMapper.listIndividualRecipe(registrationId);
        return CommonResult.success(recipe);
    }
