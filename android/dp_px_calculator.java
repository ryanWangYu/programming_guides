enum DPI {
	ldpi(0.5), mdpi(1), hdpi(1.5), xhdpi(2), tvdpi(1.33);

	private DPI(float scale) {
		mScale = scale;
	}

	public float getScale() {
		return mScale;
	}

	private float mScale;
}

int calculatePixel(float dp, DPI dpi) {
	return dp * dpi.getScale();
}
