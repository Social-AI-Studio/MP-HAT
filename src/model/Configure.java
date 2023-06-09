package model;

public class Configure {
	
	public static enum ModelMode {
		TWITTER_LDA, // single topic per post/document
		ORIGINAL_LDA,// each word has its own topic
	}

	public static enum PredictionMode {
		HAT, // Using u's hub and v's authority
		CTR, // Collaborative topic regression model
		WTFW, // KDD2014,Who to follow and Why
		COMMON_INTEREST, // Using u and v topical interests
		COMMON_NEIGHBOR, // Using Jaccard Coefficient of u and v common
							// neighborhood
		HITS,
		MPHAT, //our new model
		MPHAT_TI,
	}

	public final static int NUM_OF_PLATFORM = 2;
	public final static double PROPTION_OF_POPULAR_USERS = 0.1;
	public final static double PROPTION_OF_NONLINKS = 0.1; // we choose about 10 times the size of the number of links in each dataset
}
