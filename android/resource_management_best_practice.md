Android Resource Management Guide
=================================

Layouts
-------

+ layout/ <!--- Default layout for smartphone portrait mode -->
+ layout-land/ <!--- Layout for smartphone landscape mode -->
+ layout-sw640dp/ <!--- Default layout for tablet portrait mode -->
+ layout-sw640dp-land/ <!-- Layout for tablet landscape mode -->

Drawables
---------

+ drawable/ <!--- Stores density-independent files. E.g. shape xmls -->
+ drawable-[l|m|h|xh]dpi/ <!-- Stores density dependent files for smartphone -->
+ drawable-sw640dp-[l|m|h|xh]dpi <!--- Stores density dependent files for tablet -->

Values
------

There is no rules of naming in this directory. The best practice is use different files
to store different types of values. For example:

+ dimens		-- store margin/padding values in dp unit
+ text_sizes	-- store text sizes in sp unit
+ strings		-- pre-defined texts to be referenced from layout files or program files
+ ids			-- ideally, all view ids should be defined here to reduce redundancy.
+ colors		-- stores colors
+ attrs			-- custom view attributes
+ integers		-- store integer values only
+ booleans 		-- boolean values
+ styles		-- custom view element styles to override android default styles
+ theme			-- application-wide UI theme to override android default themes

Raw
---

The directory is res/raw/

Static files that are to be saved to the app at compile time should be saved here. Then, use Resources#openRawResource() with id R.raw.whatever to fetch the data. the method returns a InputStream object.

Assets
------

The directory is assets/
*NOTE* assets/ is at the same level as res/

AssetManager provides a low-level way to handle raw files, e.g. audio, video.
