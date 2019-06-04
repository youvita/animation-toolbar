# animation-toolbar

1. Add the JitPack repository to your build file
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
	}
}
  
2. Add the dependency
dependencies {
	  implementation 'com.github.youvita:animation-toolbar:1.0.0'
}

3. How to use
final Toolbar toolbar = findViewById(R.id.tool_bar);

Button buttonUp = findViewById(R.id.btn_up);
buttonUp.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ToolBarAnimation.tranAnimationUp(MainActivity.this, toolbar);
    }
});

Button buttonDown = findViewById(R.id.btn_down);
buttonDown.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ToolBarAnimation.tranAnimationDown(MainActivity.this, toolbar);
    }
});


