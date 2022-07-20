# Staying Aware of New Features

- [Java Platform Evolution](https://dev.java/evolution/)

    - Java is still moving on.
        
        >  *From this article, it is very clear Java still grows today. I like its philosophy. `Higher is Better`.*

        > *Java continues to evolute itself. New features, Tools, Performance, and **fashion**.*

        > *I think the way of coding java will become more like a script. **Anyway, I hate java :)**.*
    
    - Maybe it's time to try these features<[check more](https://dev.java/evolution/)>

        - Language Features
        - Library and Tooling
        - Security
        - Observability and Debugging
        - Garbage Collection
        - Modernizing Infrastructure
        - Removals and Deprecations
        - Misc
        - Bonus Section: Preview/Incubator Features


- [Using the Preview Features Available in the JDK](https://dev.java/learn/using-the-preview-features-available-in-the-jdk/)
    - JDK: Yes! You should try my preview features.
        > *Please have an **adventure** with preview features. These features are not stable, maybe not fashionable too.*
        
        > *But it will make JDK more powerful. Give it a try. *

    - Categories 
        > Preview

        > Experimental

        > Incubating

- Suprise!
    - What is [GC](https://dev.java/gc/)?
        > *GC is a new feature in JDK 8. It is a new way to manage memory.*

        - [Garbage Collection in Java Overview](https://dev.java/learn/garbage-collection-in-java-overview/)
            - Introduction to Garbage Collection
            - Garbage Collection in Java
    - What did I learn?
        
        **Take time to get rid of useless things.**

        *The point of GC is to save memory.* But how?

        - One hand is to **build different GCs for different scenes.**
            
            >Then you got `Serial Garbage Collector`, `Parallel Garbage Collector`, `Concurrent Mark Sweep (CMS) Garbage Collector(Deprecated in JDK 9, Removed in JDK 14)`, `Garbage First (G1) Garbage Collector (Default since JDK 9)`, `Z GC (Experimental in JDK 11, Production in JDK 15)`

        - On the other hand, **optimize the GC process design.**

            >Then you got `Heap Regions`, and `GC Process`

            - Heap Regions
                - Young Region
                    - Eden Region
                    - Survivor Region
                - Old Region
                - Permanent/Metaspace Region
            - GC Process
                - Mark
                - Sweep
                - Compaction
                
            - Types of Garbage Collections
                - **Minor**, for short-lived objects from Young Region.Minor garbage collections occur very frequently and often have very low pause times associated with them.

                - **Major**, from young region to old region

                - **Full GC**, from all regions



